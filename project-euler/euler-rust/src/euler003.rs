fn largest_prime_factor(n: u64) -> u64 {
    let mut rest = n;
    let mut largest = 1;
    let mut i = 2;
    let sqrt = (n as f32).sqrt() as u64;
    while largest < rest {
        if rest % i == 0 {
            largest = i;
            rest /= i;
        } else {
            i +=1;
            if largest == 1 && i > sqrt {
                return n;
            }
        }
    }
    largest
}

/// https://www.hackerrank.com/contests/projecteuler/challenges/euler003/problem
fn main() {
    let stdin = std::io::stdin();
    let mut buf = String::new();
    stdin.read_line(&mut buf).unwrap();
    let nr_test_cases = buf.trim().parse::<u8>().unwrap();
    for _ in 0..nr_test_cases {
        buf.clear();
        stdin.read_line(&mut buf).unwrap();
        let n = buf.trim().parse::<u64>().unwrap();
        let resp = largest_prime_factor(n);
        println!("{}", resp);
    }
}

#[cfg(test)]
mod test {
    use crate::largest_prime_factor;

    #[test]
    fn euler003() {
        assert_eq!(largest_prime_factor(10), 5);
        assert_eq!(largest_prime_factor(17), 17);
        assert_eq!(largest_prime_factor(13195), 29);
        assert_eq!(largest_prime_factor(600_851_475_143), 6857);
        assert_eq!(largest_prime_factor(1_000_000_000_000), 5);
        assert_eq!(largest_prime_factor(100000007), 100000007);
        assert_eq!(largest_prime_factor(200000033), 200000033);

    }
}