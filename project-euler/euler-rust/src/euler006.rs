pub fn find_squares_difference(n: u64) -> u64 {
    let mut a = 0u64;
    let mut b = 0u64;
    for i in 1..=n {
        a += i;
        b += i * i;
    }
    (a * a) - b
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test_find_squares_difference() {
        assert_eq!(find_squares_difference(3), 22);
        assert_eq!(find_squares_difference(10), 2640);
    }
}
