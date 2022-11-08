struct Server {
    load: i32,
}

impl Server {
    fn compute(a: i64, b: i64) -> Result<i64, String> {
        // Server::load += 1;

        if a < 0 {
            return Err("A is negative".to_string());
        }

        // vector<int> v(A, 0);
        let mut v: Vec<i32> = Vec::with_capacity(a as usize);
        v.fill(0);
        let mut real = -1;
        let cmplx = f64::sqrt(-1.0);
        if b == 0 {
            return Err("0".to_string());
        }
        real = (a / b) * real;
        // let ans = v.get(b).unwrap();
         return Ok(real + a - b);// * ans;

    }
}


fn main() {}


#[cfg(test)]
mod test {
    use crate::Server;

    #[test]
    fn t() {
        let a = f64::sqrt(-1.0);
        let b = f64::sqrt(-1.0);
        dbg!(a);
        dbg!(b);
        println!("{}", a == b);
    }

    #[test]
    fn main() {

        match std::panic::catch_unwind(|| {

            match Server::compute(-8, 5) {
                Ok(v) => {
                    println!("{}", v);
                }
                Err(e) => {
                    println!("{}", e);
                }
            };
            match Server::compute(1435434255433, 5) {
                Ok(v) => {
                    println!("{}", v);
                }
                Err(e) => {
                    println!("{}", e);
                }
            };
        }) {
            Ok(_) => {}
            Err(e) => {println!("{:?}",e)}
        };

    }
}