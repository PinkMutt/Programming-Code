print("Starting to Walk!")
local init = os.clock()

function mine()
	if robot.detect(front) then
		print("Swinging")
		robot.swing(front)
	end
end

function walk()
	for i = 0, 10 do
		robot.forward()
		mine()
	end

	robot.turnAround()

	for i = 0, 10 do
		robot.forward()
		mine()
	end

	robot.turnAround()
end


walk()
