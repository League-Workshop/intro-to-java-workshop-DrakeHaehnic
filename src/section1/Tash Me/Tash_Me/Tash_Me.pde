PImage mustache;
PImage friend;
void setup() {
friend = loadImage("yoda.jpeg");
size(800, 600);
friend.resize(width,height);

 mustache = loadImage("tash.png");

}

void draw() {
background(friend);

image(mustache, mouseX, mouseY);



}
