from tkinter import *
root=Tk()
mylabel1=Label(root,text="Hello, World!")
mylabel2=Label(root, text="My name is Polagani Abhimanyu")
mylabel1.grid(row=0,column=0)
mylabel2.grid(row=0,column=1)
root.mainloop()
#Using grid even if you resize the window the text will not move