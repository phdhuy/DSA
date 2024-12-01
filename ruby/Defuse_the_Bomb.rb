# @param {Integer[]} code
# @param {Integer} k
# @return {Integer[]}
def decrypt(code, k)
  result = []
  code.each_with_index do |code_value, i|
    if(k == 0)
      result << 0
    elsif (k > 0)
      current_index = i
      temp = 0
      index = 1
      while (index <= k)
        current_index += 1
        if (current_index > code.size - 1)
          current_index = 0
        end
        temp += code[current_index]
        index += 1
      end
      result << temp
    else
      current_index = i
      temp = 0
      index = 1
      while (index <= k.abs)
        current_index -= 1
        if (current_index < 0)
          current_index = code.size - 1
        end
        temp += code[current_index]
        index += 1
      end
      result << temp
    end
  end

  return result
end

code = [2,4,9,3]
k = -2
decrypt(code, k)

