/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Hugo Camacho
 * @version 2024.09.10
 * This is a web browser with a cursor about to minimize the page. The site is a social media page so the people are profiles.
 */
public class Picture
{
    private Square window;
    private Square cursorBottom;
    private Triangle cursorTop;
    private Circle minimize;
    private Circle close;
    private Circle expand;
    private Person profilePicOne;
    private Person profilePicTwo;
    private Square profilePicBgOne;
    private Square profilePicBgTwo;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        window = new Square();
        cursorBottom = new Square();
        profilePicBgOne = new Square();
        profilePicBgTwo = new Square();
        cursorTop = new Triangle();  
        expand = new Circle();
        minimize = new Circle();
        close = new Circle();
        profilePicOne = new Person();
        profilePicTwo = new Person();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            window.moveHorizontal(-250);
            window.moveVertical(-120);
            window.changeSize(400);
            window.makeVisible();  
            window.changeColor("blue");
            
            cursorTop.changeSize(20, 40);
            cursorTop.moveHorizontal(-70);
            cursorTop.moveVertical(-90);
            cursorTop.makeVisible();
            cursorTop.changeColor("white");
            
            cursorBottom.changeColor("white");
            cursorBottom.moveHorizontal(-180);
            cursorBottom.moveVertical(-50);
            cursorBottom.changeSize(20);
            cursorBottom.makeVisible();
            
            profilePicBgOne.moveHorizontal(-215);
            profilePicBgOne.moveVertical(0);
            profilePicBgOne.changeSize(50);
            profilePicBgOne.makeVisible();  
            profilePicBgOne.changeColor("green");
            
            profilePicBgTwo.moveHorizontal(-215);
            profilePicBgTwo.moveVertical(70);
            profilePicBgTwo.changeSize(50);
            profilePicBgTwo.makeVisible();  
            profilePicBgTwo.changeColor("green");
            
            
            
            profilePicOne.changeSize(40, 40);
            profilePicOne.makeVisible();
            profilePicOne.moveHorizontal(-160);
            profilePicOne.moveVertical(20);
            
            profilePicTwo.changeSize(40, 40);
            profilePicTwo.makeVisible();
            profilePicTwo.moveHorizontal(-160);
            profilePicTwo.moveVertical(-50);
    
            
            
            expand.changeColor("green");
            expand.moveHorizontal(-70);
            expand.moveVertical(-70);
            expand.changeSize(20);
            expand.makeVisible();
    
            minimize.changeColor("yellow");
            minimize.moveHorizontal(-100);
            minimize.moveVertical(-70);
            minimize.changeSize(20);
            minimize.makeVisible();
            
            close.changeColor("red");
            close.moveHorizontal(-130);
            close.moveVertical(-70);
            close.changeSize(20);
            close.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        window.changeColor("black");
        close.changeColor("white");
        minimize.changeColor("white");
        expand.changeColor("white");
        cursorTop.changeColor("white");
        cursorBottom.changeColor("white");
        profilePicBgOne.changeColor("white");
        profilePicBgTwo.changeColor("white");
        profilePicOne.changeColor("black");
        profilePicTwo.changeColor("black");
             
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        window.changeColor("blue");
        close.changeColor("red");
        minimize.changeColor("yellow");
        expand.changeColor("green");
        cursorTop.changeColor("white");
        cursorBottom.changeColor("white");
        profilePicBgOne.changeColor("green");
        profilePicBgTwo.changeColor("green");
        profilePicOne.changeColor("black");
        profilePicTwo.changeColor("black");
    }
}
