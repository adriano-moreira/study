import 'package:harckerrank_challenges_dart/exceptional_server.dart';
import 'package:test/test.dart';

void main() {
  test('shoud works', () {
    final listparams = <List<int>>[
      [-8, 5],
      [1435434255433, 5]
    ];
    runServer(listparams);
  });
}
