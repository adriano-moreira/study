import 'dart:math';

///https://www.hackerrank.com/challenges/exceptional-server/problem

class Server {
  static int load = 0;

  static int compute(int A, int B) {
    load += 1;
    if (A < 0) {
      throw 'A is negative';
    }
    List<int> v = List.filled(A, 0);
    int real = -1;
    int cmplx = sqrt(-1).truncate();
    if (B == 0) throw 0;
    real = ((A / B) * real).truncate();
    int ans = v[B];
    return real + A - B * ans;
  }

  static int getLoad() {
    return load;
  }
}

void  runServer(List<List<int>> listparams) {
  for (var params in listparams) {
    try {
      final resp = Server.compute(params[0], params[1]);
      print(resp);
    } catch (e) {
      print(e);
    }
  }
  print('${Server.getLoad()}');
}
