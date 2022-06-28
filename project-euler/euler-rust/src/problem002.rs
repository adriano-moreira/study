fn fibonacci_sequence(n: u64) -> Vec<u64> {
    let mut vec = vec![1, 2];
    loop {
        let last = vec[vec.len() - 1];
        let penultimate = vec[vec.len() - 2];
        let sum = last + penultimate;
        if sum > n {
            break;
        }
        vec.push(sum);
    }
    vec
}

fn fibonacci_even_sum(n: u64) -> u64 {
    let is_even = |v: &u64| v % 2 == 0;

    fibonacci_sequence(n)
        .into_iter()
        .filter(is_even)
        .sum()
}

/// https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem
fn main() {
    let stdin = std::io::stdin();
    let mut buf = String::new();
    stdin.read_line(&mut buf).unwrap();
    let nr_test_cases = buf.trim().parse::<u64>().unwrap();
    for _ in 0..nr_test_cases {
        buf.clear();
        stdin.read_line(&mut buf).unwrap();
        let n = buf.trim().parse::<u64>().unwrap();
        let resp = fibonacci_even_sum(n);
        println!("{}", resp);
    }
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn euler002() {
        assert_eq!(fibonacci_even_sum(10), 10);
        assert_eq!(fibonacci_even_sum(100), 44);

        // assert_eq!(fibonacci_even_sum(10), 44);
        // assert_eq!(fibonacci_even_sum(18), 3382);
        // assert_eq!(fibonacci_even_sum(23), 60696);
        // assert_eq!(fibonacci_even_sum(43), 350704366);
    }
}