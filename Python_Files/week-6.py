from tkinter import *
# Draw rectangle definition.
def draw_rectangle(ctemp, rtemp):
    ctemp.create_rectangle(rtemp)
top=Tk()
top.title("Draw Rectangle")
top.geometry("300x150")
#Creating a simple canvas.
can=Canvas(top,height=200,width=200)
recBox=(20,10,200,100) #It's a tuple containing coordinates x1,y1,x2,y2
# where(x1,y1) are coordinates of top-left and (x2,y2) are cooordinates of bottom-right.  
draw_rectangle(can, recBox)
can.pack()
top.mainloop()