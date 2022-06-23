///https://www.hackerrank.com/challenges/kingdom-connectivity/problem
/// null is equal INFINITE PATHS
int? countPaths(int n, List<List<int>> edges) {
  var counterPaths = 0;
  var counterSegmemts = 0;

  final firstPlace = edges[0][0];
  final destinations = _getDestinations(firstPlace, edges);

  while (destinations.isNotEmpty) {
    final current = destinations.removeAt(0);
    final newDestinations = _getDestinations(current, edges);
    if (newDestinations.isEmpty) {
      counterPaths++;
    } else {
      destinations.addAll(newDestinations);
    }

    if(++counterSegmemts > 1000000){
      return null;
    }
  }

  return counterPaths;
}

List<int> _getDestinations(int from, List<List<int>> edges) {
  return edges.where((path) => path[0] == from).map((e) => e[1]).toList();
}
