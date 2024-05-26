pub fn largest_prime_factor(n: u64) -> u64 {
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

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test_largest_prime_factor() {
        assert_eq!(largest_prime_factor(10), 5);
        assert_eq!(largest_prime_factor(17), 17);
        assert_eq!(largest_prime_factor(13195), 29);
        assert_eq!(largest_prime_factor(600_851_475_143), 6857);
        assert_eq!(largest_prime_factor(1_000_000_000_000), 5);
        assert_eq!(largest_prime_factor(100000007), 100000007);
        assert_eq!(largest_prime_factor(200000033), 200000033);
    }
}