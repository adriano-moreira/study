fn fibonacci_sequence(n: u64) -> Vec<u64> {
    let mut vec = vec![1, 2];
    for _ in 2..n {
        let last = vec[vec.len() - 1];
        let penultimate = vec[vec.len() - 2];
        let sum = last + penultimate;
        vec.push(sum);
    }
    vec
}

pub fn fibonacci_even_sum(n: u64) -> u64 {
    let is_even = |v: &u64| v % 2 == 0;
    dbg!(fibonacci_sequence(n));
    fibonacci_sequence(n)
        .into_iter()
        .filter(is_even)
        .sum()
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test_fibonacci_even_sum() {
        assert_eq!(fibonacci_even_sum(10), 44);
        assert_eq!(fibonacci_even_sum(18), 3382);
        assert_eq!(fibonacci_even_sum(23), 60696);
        assert_eq!(fibonacci_even_sum(43), 350704366);
    }
}