# MarsRover
A rover has landed on a Plateau in Mars! 

This OOP design consists of 5 classes and 1 input text file:<br/>
- Input class: where the data from InputFile.txt gets modelled into different objects that will be passed later into other class objects.<br/>
- Plateau: consists of X and Y coordinates and form the plateau upon which our Mars rover will move.<br/>
- Coordinates: used to localize our rover on the plateau. consists of XY coordinates and a cardinal direction (heading).<br/>
- MarsRover: each rover has its own Coordinates, a Plateau (which would be the same for all rovers), and a method move(), which takes a list of movements (L/R/M) and uses 3 other auxiliar methods to carry out it.<br/>
- MainMethod class: where Input, Plateau, and MarsRover instances get created so the method move() for each rover can be called.<br/>
- InputFile.txt: is located inside the src file, but out of the Main package where the classes are.<br/>

To use this model it is only needed to add some input inside the InputFile.txt along the following guidelines:<br/>
- Plateau: the first line of input is the upper-right coordinates of the plateau, the lowerleft coordinates are assumed to be 0,0.<br/>
- The rover's coordinates: the rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover’s position. The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover’s orientation.
- The rover's movements: the second line is a series of instructions telling the rover how to explore the plateau. <br/>

(Example)<br/>
5 5<br/>
1 2 N<br/>
LMLMLMLMM<br/>
3 3 E<br/>
MMRMMRMRRM<br/>

If no input is added or modified, the example input will be run.<br/>

The output of move() consists of a Coordinates object (two coordinates and the heading), which gets printed at the end of each movement array.<br/>

If the movements array given pushes the rover out of the plateau's boundaries, the rover's will crash, its coordinates will be set to {-1, -1, 'Z'} and from that moment on, no matter which movements come next, it won't be possible to put it back to the plateau and it will continue to return the same coordinates.<br/>

One JUnit test for method move() is provided, which tests different arrays of movements that call separately each of the auxiliar methods rotateLeft() rotateRight() and ahead() in different combinations. The test also asserts the "out of bounds" condition, in case the rover has moved beyond the plateau's XY.
