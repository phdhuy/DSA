# @param {Integer[]} asteroids
# @return {Integer[]}
def asteroid_collision(asteroids)
  stack = []
  asteroids.each do |asteroid|
    while !stack.empty? && asteroid < 0 && stack.last > 0
      if stack.last.abs < asteroid.abs
        stack.pop
        next
      elsif stack.last.abs == asteroid.abs
        stack.pop
      end
      asteroid = 0
    end

    stack << asteroid if asteroid != 0
  end

  return stack
end

arr = [10, 2, -5]
asteroid_collision(arr)
