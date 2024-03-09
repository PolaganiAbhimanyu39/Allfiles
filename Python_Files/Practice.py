from datetime import datetime
import os
class Bank():
    def __init__(self):
        self.time=datetime.utcnow()
        pass
    def open_account(self,id):
        self.id=id
        self.balance=0
        with open(f"Account-no-{self.id}","w") as fp:
            self.fp=fp
    def credit(self,n):
        self.balance+=n
        content=f"{self.time} | {n}"
        self.fp.write(content)
    def debit(self,n):
        if (self.balance-n)<0:
            print("Insufficient balance")
        else:
            self.balance-=n
            content=f"{self.time} | {-n}"
            self.fp.write(content)
    def __str__(self):
        return()