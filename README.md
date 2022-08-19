# PetClinic

#lifecycle annotation
--
In this video, we're going to talk about the spring being life cycle. So we've been looking at dependency injection, but the way that spring framework actually creates a manages spring beans, they go through a very specific lifecycle.
So you can see here, I've got a little flowchart as to how things go through and spring framework. First thing, of course, it's going to instantiate the class. Once the class has been created, it's going to populate properties. So any properties that you have, it's going to set those up.
Then we do have some interfaces that we can implement if they are there. If you've implemented these interfaces, spring will execute these methods.
So you can see here called a set being name of being aware, being name aware.

Then we have the being factory aware, the application context aware, and then we have pre initialization and this is going to be done with a post being processor. So these are callbacks that we can hook into. And then finally we get to after property set of initializing beings. We can also provide custom initialization methods. And then one of the last things is the post initialization. So these are all steps that the being goes through before it is ready to use. So spring is going to go through and perform all these steps on every being in the context before the application is considered ready for use.
So it gives you a number of places to hook in. You do have a lot of control and flexibility over this, to be honest. It's very, very rare that you need to to hook into this. There are use cases that you get into, but it's fairly rare that you need this much control out of how the beans are being created.
When you do it, you're usually doing something a little complex. But I think the key takeaway is to have the awareness this is there and is there available for you to
use when you need it.

So here, this is just the beam becoming ready for use. There is also a lifecycle for the beans to be terminated. So when the container is being shut down, the application is received. Some type of shutdown event. There is a lifecycle for the shutdown so you can annotate a bean method with the annotation app pre destroyed that will get annotated. And then you can also implement a disposable bean interface that provides a destroy method so that the annotation will come first and then the destroy method. And at that point we call the being terminated. So we didn't talk about some of the interfaces.

Spring does have to interfaces you can implement for callback events and you have the initializing being which gives you after property set. So that is a method that would be executed if you implement that interface and then we have the disposal being. So we talked about that being one of the last things that gets called before the being is terminated.

You do also have a couple of annotations and these were in that flowchart as well. We have post construct. So the bean has been constructed but it has not been returned to the requesting object. And then we also have pre destroyed. So if you remember in the termination workflow, this was called just before the interface method is called and then we have been post processors.

These are actually can be convenient if you're working with some type of third party object that you need to create and put into your context and need to update it somehow like set setting configuration properties and a typically a non spring managed component. So this gives you some capabilities. The main takeaway you want to have here on the post being processors, these are called globally. So basically you get this event and it's going to look through if you implement it, you get this called for every object or every being in the context of you have 100 means it will get called 100 times.

So the way you typically implement this, you're probably looking for a specific being, a type of beam that you need to work with. So you'll do some type of type checking before you try to work with it. And I do have to use this now and then. It's not frequent, but you do have to tap into that. Then finally spring also has over 14 aware interfaces. So these extend interface literally called aware. So they are extensions of that.

There are 14 of them. These are are largely used within the spring framework. So if you're developing spring applications, going to be rare that you use these, but be aware. So if you do have a use case, you do get into cases where you do need to tap into these. These can be very handy. Again, it's rare, very rare that I've had to use it. I've worked with a lot of spring applications and it's pretty rare that I do need to work with them. These are some of the current ones. I'm not going to go through everyone. I'm going to leave the slides here for your reference.

You can see there's a lot of them, a lot of different events that we can tap into and not all of these will be available for every application. But if you do need to tap into one of these to do something that these are really, really edge cases, but be aware that they are available there for you. If you do need to use them, they are available. So like everything in spring, it gives you a lot of capabilities, a lot of ways to do customizations.

#Interface Naming
---
