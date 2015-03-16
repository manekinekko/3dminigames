# Introduction #

This is a simple how to introduction to the 3DWIGS GUI.


# Table of contents #
  1. Importing 3D models
  1. Interacting with the 3D models
  1. Creating new Types
  1. Managing game rules

## 1- Importing 3D models ##
3DWIGS GUI allows you to import 3D models<sup>*</sup> so you can easily add them to your 3D canvas. To do so, just drag and drop your 3D model, **one at a time** onto 3DWIGS GUI and you are done. You may also use the preset tool to import the free 3D models and some basic shapes (Cubes, Spheres, Cylinders, ...etc). Please note that when you import a new model to your canvas, it is saved in the preset tool, so you can easily add the same model later without importing it again!

## 2- Interacting with the 3D models ##
With 3DWIGS GUI you can easily intercat with your models as you would do with any 3D model software. Here are the available actions:
  * **Scale** your 3D model just by holding the s key on your keyboard and scrolling your mouse wheel up and down.
  * **Move** your 3D model by holding any of the x, y or z key on your keyboard and use your mouse to click on your model and drag your model. It will then move on the X, Y or Z-axis depending on which key you press.
  * **Rotate** your 3D model simply by clicking on your model and dragging your mouse.

## 3- Creating new Types ##
From the 3DWIGS you have the possibility to manage your game entities types.
When you add or import a new model or shape, you will be asked to give it a name and choose an attached type, this type corresponds to the entity that represents your 3D model in your game scenario! In other words, you **must** attach your 3D model with a defined type that will handle that 3D model from the game logic.
To define in new type, just hit the "create new type" link from the Entity Information window. The new type must have the following properties:
  * **Name** A valid name, without space nor wild characters.
And the following optional properties:
  * **Type Model** This is basically a type that is defined by 3DWIGS and which represent a default type you may inherent your custom type from. Please remember that by inheriting your custom type from default types, it will inherit all their properties!
  * **Attribute** You can also add default properties to your custom type.


## 4- Managing game rules ##
TODO: complete this !