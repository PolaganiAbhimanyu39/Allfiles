class Tree:
    def __init__(self,initval=None):
        self.value=initval
        if self.value:
            self.left=Tree()
            self.right=Tree()
        else:
            self.left=None
            self.right=None
        return()
    def isempty(self):
        return(self.value==None)