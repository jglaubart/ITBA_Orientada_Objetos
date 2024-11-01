# frozen_string_literal: true

class Wheel
  def initialize(rim, tire)
    @rim = rim
    @tire = tire
  end

  def diameter
    @rim + 2 * @tire
  end

end
