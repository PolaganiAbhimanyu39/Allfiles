def announce(f):
    def wrapper():
        print("About to run function")
        f()
        print("Function run ended")
    return wrapper

@announce
def hello():
    print("Hello, World!")
hello()