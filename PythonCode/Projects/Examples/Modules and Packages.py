# A module in python can be used to hold the functions and variable to do a specific task helping to organized the code.

# game.py
# import the draw module
#import draw

# def play game():
#    ...

# def main():
    # result = play_game()
    # draw.draw_game(result)

# this means that if this script is executed, then
# main() will be executed
# if _name_ == '_main_':
    # main()




# draw.py

# def draw_game():
    # ...

# def clear_screen(screen):
#    ...

# You could import and using the from command allowing the draw_game into the main namespace

# game.py
# import the draw module
# from draw import draw_game

# def main():
#    result = play_game()
#    draw_game(result)

# using import * will allow you to use all the files from the specified module

# game.py
# import the draw module
# if visual_mode:
#     in visual mode, we draw using graphics
#    import draw_visual as draw
 #else:
    # in textual mode, we print out text
#    import draw_textual as draw

# def main():
#    result = play_game()
    # this can either be visual or textual depending on visual_mode
#    draw.draw_game(result)


# An environmental variable PYTHONPATH can be used to specify additional directories to look for modules.
# PYTHONPATH=/foo python game.py
# sys.path.append function may execute it before running an import command

# Built-in modules
import urllib
 # use it
 # urllib.urlopen(...)

print(dir(urllib))

# You can use help() to read more on the modules
print(help(urllib.__doc__))
