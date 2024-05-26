pub fn smallest_multiple(n: u64) -> u64 {
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

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test_smallest_multiple() {
        assert_eq!(smallest_multiple(3), 6);
        assert_eq!(smallest_multiple(10), 2520);
    }
}
