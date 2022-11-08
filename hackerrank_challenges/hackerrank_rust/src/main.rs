// static int compute(long long A, long long B) {
// load += 1;
// if(A < 0) {
// throw std::invalid_argument("A is negative");
// }
// vector<int> v(A, 0);
// int real = -1, cmplx = sqrt(-1);
// if(B == 0) throw 0;
// real = (A/B)*real;
// int ans = v.at(B);
// return real + A - B*ans;
// }

use std::array::IntoIter as MY;
use std::fmt::{Display, Formatter};
use std::ops::{Add, Neg};

#[derive(Debug)]
struct Point {
    x: i32,
    y: i32,
}

struct PointTuple(i32,i32);

impl Display for Point {
    fn fmt(&self, f: &mut Formatter<'_>) -> std::fmt::Result {
        write!(f, "{},{}", self.x, self.y)
    }
}

impl Add for Point {
    type Output = Point;

    fn add(self, rhs: Self) -> Self::Output {
        Point { x: self.x + rhs.x, y: self.y + rhs.y }
    }
}

impl Neg for Point {
    type Output = Point;

    fn neg(self) -> Self::Output {
        Point { x: self.x * -1, y: self.y * -1 }
    }
}

impl Point {
    fn my_print(&self) {
        println!("{}", self);
    }
}

impl IntoIterator for Point {
    type Item = i32;
    type IntoIter = MY<i32, 2>;

    fn into_iter(self) -> Self::IntoIter {
        MY::new([self.x, self.y])
    }
}

fn main() {
    let p1 = Point { x: -3, y: 1 };
    let p2 = Point { x: 1, y: 3 };
    let p3 = p1 + p2;
    for x in p3 {
        println!("-->> {}",x)
    }
    // (-p3).my_print();
    //
    // let mut a = 0;
    // a += 1;
    // // let + = 0;
    // // a++;
    //
    // let arr = vec![0,1,3];
    // for x in arr {
    //     println!("--> {}", x);
    // }

    let a = |b:i32| b*2;

}
