use num_bigint::BigUint;

pub fn power_digit_sum(p: u32) -> u32 {
    let string = "2".parse::<BigUint>().unwrap().pow(p).to_string();
    let a: Vec<_> = string.split("")
        .filter(|e| !e.is_empty())
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
    use super::*;

    #[test]
    fn test_power_digit_sum() {
        assert_eq!(power_digit_sum(15), 26);
        assert_eq!(power_digit_sum(128), 166);
        assert_eq!(power_digit_sum(1000), 1366);
    }
}
