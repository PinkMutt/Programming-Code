local init = os.clock()
turnLeft = true
function walk(steps)
    print("Starting to Walk!")
 
    for i = 0, steps do
        robot.forward()
    end
 
    robot.turnAround()
 
    for i = 0, steps do
        robot.forward()
    end
 
    robot.turnAround()
end
 
local function walkNow()
    print("Start to Walk!")
    while true do
        local b, s = robot.detect()
        if b then
            if robot.compare() then
                if turnLeft then
                    robot.turnLeft()
                    robot.forward()
                    robot.forward()
                    b, s = robot.detect()
                    robot.turnLeft()
                    if b then
                        turnLeft = true
                    else    
                        turnLeft = false
                    end
                else
                    robot.turnRight()
                    robot.forward()
                    robot.forward()
                    b, s = robot.detect()
                    robot.turnRight()
                    if b then
                        turnLeft = false
                    else
                        turnLeft = true
                    end
                end
            else
            robot.swing()
            end
        end
        robot.forward()
    end     
end 
--[[
io.write('How many steps would you like me to walk, Master?')
steps = io.read()
walk(steps);
]]
 
walkNow()