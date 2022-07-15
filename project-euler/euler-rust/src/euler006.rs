fn find_squares_diference(n: u64) -> u64 {
    let mut a = 0u64;
    let mut b = 0u64;
    for i in 1..=n {
        a += i;
        b += i * i;
    }
    (a * a) - b
}

fn main() {
    let stdin = std::io::stdin();
    let mut buf = String::new();
    stdin.read_line(&mut buf).unwrap();
    let qtd_test_cases = buf.trim().parse::<u64>().unwrap();
    for _ in 0..qtd_test_cases {
        buf.clear();

        stdin.read_line(&mut buf).unwrap();
        let n = buf.trim().parse::<u64>().unwrap();
        let r = find_squares_diference(n);
        println!("{}", r);
    }
}

#[cfg(test)]
mod test {
    use crate::find_squares_diference;

    #[test]
    fn main() {
        assert_eq!(find_squares_diference(3), 22);
        assert_eq!(find_squares_diference(10), 2640);
    }
}
