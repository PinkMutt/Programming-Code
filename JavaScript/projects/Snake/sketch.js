function setup() {
	createCanvas(600, 600);
	s = new Snake();
	a = new Apple();
	frameRate(10);
}

function draw() {
	background(51);
	/*if(s.getX === a.getX && s.getY === a.getY) {
		a.tp();
	}*/
	s.update();
	s.show();
	a.show();
}

function keyPressed() {
	if (keyCode === UP_ARROW) {
		s.dir(0, -1);
	} else if (keyCode === DOWN_ARROW) {
		s.dir(0, 1);
	} else if (keyCode === LEFT_ARROW) {
		s.dir(-1, 0);
	} else if (keyCode === RIGHT_ARROW) {
		s.dir(1, 0);
	}
}


class Apple {
	constructor() {
		/* this.x = 5 * Math.ceil(120 * Math.random()) - 1;
		this.y = 5 * Math.ceil(120 * Math.random()) - 1;
		*/
		this.tp();
	}

	show() {
		fill(255);
		circle(this.x, this.y, 10);
	}

	tp() {
		this.x = 5 * Math.ceil(115 * Math.random());
		this.y = 5 * Math.ceil(115 * Math.random());
		console.log(this.x, this.y);
	}

	getX() {
		return this.x;
	}

	getY() {
		return this.y;
	}
	

}

