from tkinter import *
#draw_rectangle defintion.
def draw_rectangle(ctemp, rtemp, color):
    ctemp.create_rectangle(rtemp, fill=color)
top=Tk()
top.title("Draw Rectangle")
top.geometry("300x150")

#creating a simple canvas
can=Canvas(top,height=200, width=200)
recBox=(20,10,200,100)
draw_rectangle(can, recBox, "red")

can.pack()
top.mainloop()