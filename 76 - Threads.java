class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100000;i++)
		{
			System.out.println("Hi");
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100000;i++)
		{
			System.out.println("Hello");
		}
	}
}

class Demo {
    /*  

        In Java, a thread is a separate flow of execution within a program. Think of it like a separate worker that can perform a specific task independently of the main program.

        Why do we need threads?

        Imagine you're at a restaurant and you order food. The waiter takes your order and goes to the kitchen to place it. But, the kitchen is busy making food for other customers. If the waiter had to wait for the kitchen to finish making food for everyone else before placing your order, you'd have to wait a long time!

        That's where threads come in. Just like the waiter can place your order while the kitchen is busy with other tasks, a thread can perform a specific task while the main program is busy with other things.

        Real-life example:

        Let's say you're watching a video on YouTube while also chatting with friends on WhatsApp. Your phone's processor is like the kitchen, and the video player and WhatsApp app are like two separate threads. The video player thread is playing the video, while the WhatsApp thread is handling your chat messages. Both threads are running simultaneously, without blocking each other. 

        When building projects using framwords, the framwork handle the thread behind the scenes.

     */
    public static void main(String[] args) {
        A obj1=new A();
    	B obj2=new B();
    	
        // obj1.show();
        // obj2.show();
    	
    	obj1.start();
    	obj2.start();
    }
    
}
