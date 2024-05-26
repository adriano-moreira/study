fn is_palindrome(n: u64) -> bool {
    let l = n.to_string();
    let r = l.chars().rev().collect::<String>();
    l == r
}

pub fn largest_palindrome_product(n: u64) -> u64 {
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


#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test_largest_palindrome_product() {
        assert_eq!(largest_palindrome_product(101110), 101101);
        assert_eq!(largest_palindrome_product(800000), 793397);
    }
}
