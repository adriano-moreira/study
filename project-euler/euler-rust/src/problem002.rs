fn fibonacci_sequence(n: usize) -> Vec<i32> {
    let mut vec = vec![1, 2];
    while vec.len() < n {
        let last = vec[vec.len() - 1];
        let penultimate = vec[vec.len() - 2];
        vec.push(last + penultimate);
    }
    return vec;
}

fn fibonacci_even_sum(n: usize) -> i32 {
    let is_even = |v: &i32| v % 2 == 0;

    fibonacci_sequence(n)
        .into_iter()
        .filter(is_even)
        .sum()
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test() {
        assert_eq!(44, fibonacci_even_sum(10));
        assert_eq!(3382, fibonacci_even_sum(18));
        assert_eq!(60696, fibonacci_even_sum(23));
        assert_eq!(350704366, fibonacci_even_sum(43));
    }
}