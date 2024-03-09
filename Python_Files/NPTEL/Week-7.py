import datetime

class Account:
    def __init__(self, id, log_dir):
        self.id = id
        self.balance = 0
        self.logfile = f"{log_dir}/{id}.log"
        with open(self.logfile, "w") as file:
            pass

    def update(self, amount):
        new_balance = self.balance + amount
        if new_balance < 0:
            print("Insufficient balance")
            return
        self.balance = new_balance
        self._update_log(amount)

    def _update_log(self, amount):
        with open(self.logfile, "a") as file:
            file.write(f"{datetime.datetime.utcnow()} | {amount}\n")
    def __str__(self):
        return f"id:{self.id} | balance: {self.balance}"
    def ministatement(self):
        with open(self.logfile, "r") as ptr:
            for line in ptr.seek(-5):
                print(line)
abhi=Account(123,"read")
for i in range(100):
    abhi.update(i)
abhi.ministatement()
