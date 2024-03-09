info='He said his favourite book is "Hitchhiker\'s guide to the Galaxy"'
print(info)
# To write ' in a string you can also use \' to add a (').
news='''He said his favourite book is "Hitchhiker's guide to the Galaxy"'''
print(news)
# You can print both (') and ("") bu using triple quotes(''')
# Strings are immutable.
message="Hell"
# you'll get an error, coz you can't assign strings like that.
try:
    message[0]="B"
except(TypeError):
    print("Since you're facing a typeError you're seeing this.")
# Correct way to manipulate strings
message="B"+message[1:]
print(message)
new=message
message=message+"o"
print(message)
print(new)
print(message is new)

 