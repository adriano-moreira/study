fn sqrt(n: u64) -> u64 {
    (n as f32).sqrt() as u64
}

fn is_prime(n: u64) -> bool {
    if n < 2 {
        return false;
    }
    for x in 2..(sqrt(n) + 1) {
        if n % x == 0 {
            return false;
        }
    }
    true
}

fn next_prime(n: u64) -> u64 {
    let mut i = n;
    'outer: loop {
        i += 1;
        let max = sqrt(i) + 1;
        for x in 2..max {
            if i % x == 0 {
                continue 'outer;
            }
        }
        return i;
    }
}

trait PrimeUtils {
    fn next_prime(&self) -> Self;
    fn is_prime(&self) -> bool;
}
impl PrimeUtils for u64 {
    fn next_prime(&self) -> Self {
        next_prime(*self)
    }

    fn is_prime(&self) -> bool {
        is_prime(*self)
    }
}


fn main() {
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn next() {
        dbg!(200_000_000u64.next_prime());
    }

    #[test]
    fn is() {
        for n in 0..100u64 {
            if n.is_prime() {
                // println!("n: {:?} is prime", n);
                print!("{:?},", n);
            } else {
                // println!(".");
            }
        }
    }
}