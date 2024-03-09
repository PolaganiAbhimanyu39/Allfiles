from tkinter import *
# This creates a Tk object, which is the main window of the GUI application
root=Tk()
#Creates a label widget inside root window it prints the given text.
wid=Label(root, text="Hello World!")
# Packs the label widget into the main window this makes the label visible within the main window.Using pack even if you resize the window the text will move at the centre.
wid.pack()
# This an event loop.
wid.mainloop()
