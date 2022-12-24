/*
	 Snake Class - Creates the Snake

*/
const SNAKE_COLOR = 255;
const BOX_SIZE = 400;
class Snake {
	//SNAKE_COLOR = 255;
	constructor() {
		this.x = 0;
		this.y = 0;
    	this.xspeed = 10;
		this.yspeed = 0;

	}
	update() {
		this.x = this.x + this.xspeed;
		this.y = this.y + this.yspeed;

		this.x = constrain(this.x, 0, BOX_SIZE);
		this.y = constrain(this.y, 0, BOX_SIZE);
	}
 
	show() {
		fill(SNAKE_COLOR);
		rect(this.x, this.y, 10, 10);
	}

	dir(x, y) {
		if (y === 1) { // DOWN 
			if (this.yspeed !== -1) {
				//while(this.x % 5 !== 0 && this.x % 2 !== 0) { // # Leave While Loop when it is ten
				while(this.x % 10 !== 0) {
					console.log(this.x);
					s.update();
				console.log('x = ' + this.x);
				console.log(this.yspeed);
				 this.xspeed = 0;
				 this.yspeed = 1;	
			}
		} else if(y === -1) { // UP
			if (this.yspeed !== 1) {
				//while(this.x % 5 !== 0 && this.x % 2 !== 0) {
				while(this.x % 10 !== 0) {
					console.log(this.x);
					s.update();
					console.log(this.x);
				}
				this.xspeed = 0;
				this.yspeed = -1;
			}
		} else if(x === 1) { // RIGHT
			if (this.xspeed !== -1) {
				//while(this.y % 5 !== 0 && this.y % 2 !== 0) {
				while(this.y % 10 !== 0) {
					console.log(this.x);
					s.update();
					console.log(this.x);
				}
				this.xspeed = 1;
				this.yspeed = 0;
			}
		} else if(x === -1) { // LEFT
			if (this.xspeed !== 1) {
				//while(this.y % 5 !== 0 && this.y % 2 !== 0) {
				while(this.y % 10 !== 0) {
					console.log(this.x);
					s.update();

				}
				this.xspeed = -1;
				this.yspeed = 0;
			}
		}
	}

	getX() {
		return this.x;
	}

	getY() {
		return this.y;
	}
}

