import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(
    const MaterialApp(
      home: Problem015Page(),
    ),
  );
}

List<List<Offset>> getAllPaths(int gridSize) {
  List<List<Offset>> fillNextPoints(List<Offset> base) {
    final filled = <List<Offset>>[];
    final last = base.last;
    if (last.dx != gridSize) {
      final n = Offset(last.dx + 1, last.dy);
      filled.add([...base, n]);
    }
    if (last.dy != gridSize) {
      final n = Offset(last.dx, last.dy + 1);
      filled.add([...base, n]);
    }
    return filled;
  }

  bool isComplete(List<Offset> path) {
    return path.last.dx == gridSize && path.last.dy == gridSize;
  }

  final incomplete = [
    [const Offset(0, 0)]
  ];
  final resp = <List<Offset>>[];

  while (incomplete.isNotEmpty) {
    final temp = <List<Offset>>[];
    for (var base in incomplete) {
      temp.addAll(fillNextPoints(base));
    }

    incomplete.clear();
    for (var path in temp) {
      if (isComplete(path)) {
        resp.add(path);
      } else {
        incomplete.add(path);
      }
    }
  }

  return resp;
}

class Problem015Page extends StatelessWidget {
  const Problem015Page({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Euler 015'),
      ),
      body: ListView.builder(
        itemCount: 100,
        itemBuilder: (ctx, index) {
          final gridSize = index + 2;
          return ListTile(
            onTap: () {
              Navigator.of(context).push(
                MaterialPageRoute(
                  builder: (context) {
                    return AllGridPath(
                      gridSize: gridSize,
                    );
                  },
                ),
              );
            },
            title: Text('gridSize: $gridSize'),
          );
        },
      ),
    );
  }
}

class AllGridPath extends StatefulWidget {
  final int gridSize;

  const AllGridPath({
    Key? key,
    required this.gridSize,
  }) : super(key: key);

  @override
  State<AllGridPath> createState() => _AllGridPathState();
}

class _AllGridPathState extends State<AllGridPath> {
  List<List<Offset>>? paths;

  @override
  void initState() {
    super.initState();
    compute(getAllPaths, widget.gridSize).then((paths) {
      setState(() {
        this.paths = paths;
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    final paths = this.paths;
    if (paths == null) {
      return Scaffold(
        appBar: AppBar(
          title: Text(
            'gridSize: ${widget.gridSize}, processing paths...',
          ),
        ),
        body: const Center(
          child: CircularProgressIndicator(),
        ),
      );
    }
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'gridSize: ${widget.gridSize}, totalPaths: ${paths.length}',
        ),
      ),
      body: ListView.builder(
        itemCount: paths.length,
        itemBuilder: (context, index) {
          final path = paths[index];
          return toItem(index, path);
        },
      ),
    );
  }

  Widget toItem(int index, List<Offset> path) {
    return Padding(
      padding: const EdgeInsets.all(4.0),
      child: Column(
        children: [
          Text('path: ${index + 1}'),
          Euler15Paint(gridSize: widget.gridSize, path: path)
        ],
      ),
    );
  }
}

const cubeLen = 50.0;
const slimLen = 1.0;
const fatLen = 3.0;

class Euler15Paint extends StatelessWidget {
  final int gridSize;
  final List<Offset> path;

  const Euler15Paint({
    Key? key,
    required this.gridSize,
    required this.path,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      width: (gridSize * cubeLen),
      height: (gridSize * cubeLen),
      child: CustomPaint(
        painter: _Euler15Painter(
          gridSize: gridSize,
          path: path,
        ),
      ),
    );
  }
}

class _Euler15Painter extends CustomPainter {
  final int gridSize;
  final List<Offset> path;

  const _Euler15Painter({
    required this.gridSize,
    required this.path,
  });

  @override
  void paint(Canvas canvas, Size size) {
    final slimLinePaint = Paint()
      ..strokeWidth = slimLen
      ..color = Colors.grey;

    double xStart = 0;
    double xEnd = (gridSize * cubeLen) / 1;
    for (var y = 0; y <= gridSize; y++) {
      canvas.drawLine(
        Offset(xStart, (y * cubeLen) / 1),
        Offset(xEnd / 1, (y * cubeLen) / 1),
        slimLinePaint,
      );
    }

    double yStart = 0;
    double yEnd = (gridSize * cubeLen) / 1;
    for (var x = 0; x <= gridSize; x++) {
      canvas.drawLine(
        Offset((x * cubeLen) / 1, yStart),
        Offset((x * cubeLen) / 1, yEnd),
        slimLinePaint,
      );
    }

    var paint = Paint()
      ..color = Colors.black
      ..style = PaintingStyle.stroke
      ..strokeWidth = fatLen;

    final path = Path();

    for (var offset in this.path) {
      path.lineTo(
        offset.dx * cubeLen,
        offset.dy * cubeLen,
      );
    }

    canvas.drawPath(
      path,
      paint,
    );
  }

  @override
  bool shouldRepaint(covariant CustomPainter oldDelegate) {
    return false;
  }
}
