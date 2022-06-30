fn is_palindrome(n: u64) -> bool {
    let l = n.to_string();
    let r = l.chars().rev().collect::<String>();
    l == r
}

fn largest_palindrome_product(n: u64) -> u64 {
    let mut largest = 0;
    let product_size = (n.to_string().len() / 2) as u32;
    let min = 10u64.pow(product_size - 1);
    let max = 10u64.pow(product_size);
    for x in min..max {
        for y in min..max {
            let p = x * y;
            if p > largest  && p < n && is_palindrome(p)  {
                largest = p;
            }
        }
    }
    largest
}

/// https://www.hackerrank.com/contests/projecteuler/challenges/euler004/problem
fn main() {
    let stdin = std::io::stdin();
    let mut buf = String::new();
    stdin.read_line(&mut buf).unwrap();
    let nr_test_cases = buf.trim().parse::<u8>().unwrap();
    for _ in 0..nr_test_cases {
        buf.clear();
        stdin.read_line(&mut buf).unwrap();
        let n = buf.trim().parse::<u64>().unwrap();
        let resp = largest_palindrome_product(n);
        println!("{}", resp);
    }
}

#[cfg(test)]
mod test {
    use crate::largest_palindrome_product;

    #[test]
    fn main() {
        assert_eq!(largest_palindrome_product(101110), 101101);
        assert_eq!(largest_palindrome_product(800000), 793397);
    }
}
