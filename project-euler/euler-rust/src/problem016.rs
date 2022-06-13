use num_bigint::BigUint;

fn power_digit_sum(p: u32) -> u32 {
    let string = "2".parse::<BigUint>().unwrap().pow(p).to_string();
    let a: Vec<_> = string.split("")
        .filter(|e| e.trim().len() > 0)
        .map(|e| e.parse::<u32>().unwrap())
        .collect();

    let mut sum = 0u32;
    for x in a {
        sum += x;
    }
    sum
}

#[cfg(test)]
mod test {
    use crate::problem016::*;

    #[test]
    fn test() {
        assert_eq!(power_digit_sum(15), 26);
        assert_eq!(power_digit_sum(128), 166);
        assert_eq!(power_digit_sum(1000), 1366);
    }
}
