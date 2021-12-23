fn factors_count(n: u64) -> u64 {
    let mut count = 2;

    let end = (n as f64).sqrt() as u64;

    for i in 2..end {
        if n % i == 0 {
            count = count + 2;
        }
    }

    if end * end == n {
        count = count + 1;
    }

    count
}

fn divisible_triangle_number(n: u64) -> u64 {
    let mut i = 1;
    let mut sum = i;
    while factors_count(sum) < n {
        i = i + 1;
        sum = sum + i;
    }

    sum
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test() {
        assert_eq!(28, divisible_triangle_number(5));
        assert_eq!(630, divisible_triangle_number(23));
        assert_eq!(1385280, divisible_triangle_number(167));
        assert_eq!(17907120, divisible_triangle_number(374));
        assert_eq!(76576500, divisible_triangle_number(500));
    }
}