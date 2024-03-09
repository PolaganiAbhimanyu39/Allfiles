import tkinter as tk

def add():
    num1=float(num1_entry.get())
    num2=float(num2_entry.get())
    result= num1+num2
    result_label.config(text="")

def reset():
    num1_entry.delete(0,'end')
    num2_entry.delete(0,'end')
    result_label.config(text="")
#Create the main window
top=tk.Tk()
top.title("Add two numbers")
#Create the widgets
num1_label=tk.Label(top, text="Number 1:")
num1_entry=tk.Entry(top)
num2_label=tk.Label(top, text="Number 2:")
num2_entry=tk.Entry(top)
add_button=tk.Button(top, text="Add",command=add)
reset_button=tk.Button(top, text="Reset",command=reset)
result_label=tk.Label(top, text="")

#Layout the widgets
num1_label.grid(row=0, column=0)
num1_entry.grid(row=0, column=1)
num2_label.grid(row=1, column=0)
num2_entry.grid(row=1, column=1)
add_button.grid(row=2, column=0)
reset_button.grid(row=2, column=1)
result_label.grid(row=3, column=0, columnspan=2)

#Run the main loop
top.mainloop()