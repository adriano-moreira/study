fn smallest_multiple(n: u64) -> u64 {
    'outer: for x in n.. {
        for f in 2..(n + 1) {
            if x % f != 0 {
                continue 'outer;
            }
        }
        return x;
    }
    0
}

/// https://www.hackerrank.com/contests/projecteuler/challenges/euler005/problem
fn main() {
    let stdin = std::io::stdin();
    let mut buf = String::new();
    stdin.read_line(&mut buf).unwrap();
    let nr_test_cases = buf.trim().parse::<u64>().unwrap();
    for _ in 0..nr_test_cases {
        buf = String::new();
        stdin.read_line(&mut buf).unwrap();
        let value = buf.trim().parse::<u64>().unwrap();
        let resp = smallest_multiple(value);
        println!("{}", resp);
    }
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn main() {
        assert_eq!(smallest_multiple(3), 6);
        assert_eq!(smallest_multiple(10), 2520);
    }
}
