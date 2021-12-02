int smallestMult(int value){
  int current = 0;
  while(true) {
    current++;
    var valid = true;
    for (int i = 1; i <= value; i++) {
      if(current % i != 0){
        valid = false;
        break;
      }
    }
    if(valid) {
      return current;
    }
  }
}