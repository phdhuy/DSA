def can_complete_circuit(gas, cost)
  total_tank = 0
  current_tank = 0
  starting_index = 0

  gas.each_with_index do |gas_value, i|
    total_tank += gas_value - cost[i]
    current_tank += gas_value - cost[i]

    if current_tank < 0
      starting_index = i + 1
      current_tank = 0
    end
  end

  total_tank >= 0 ? starting_index : -1
end

gas = [5,8,2,8]
cost = [6,5,6,6]
can_complete_circuit(gas, cost)