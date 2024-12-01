# @param {Integer[]} digits
# @return {Integer[]}
def plus_one(digits)
  digit = digits.join.to_i
  digit += 1
  puts digit.to_s.chars.map(&:to_i)
end

digits = [9]
plus_one(digits)