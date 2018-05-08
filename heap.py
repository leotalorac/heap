#contructor of the class
class heap:
    def __init__ (self):
        self.heapList = [0]
        self.size = 0
    #organice the heap from the final
    def putUp(self,index):
        #the mid of the branch
        #find the right place
        while index // 2 >0:
            #replace the fields
            if self.heapList[index] < self.heapList[index // 2]:
                temp = self.heapList[index // 2]
                self.heapList[index // 2] = self.heapList[index]
                self.heapList[index] = temp
            index = index // 2;

    #organice the heap from the top
    def putDown(self,index):
        while(index *2) <= self.size:
            midpos = self.mid(index)
            #replace
            if self.heapList[index] > self.heapList[midpos]:
                tmp = self.heapList[index]
                self.heapList[index] = self.heapList[midpos]
                self.heapList[midpos] = tmp
            index = midpos

    #insert the new value, recive the value
    def insert(self,k):
        #put the element
        self.heapList.append(k)
        #increace the size
        self.size = self.size + 1
        #organize the new element in the position
        self.putUp(self.size)

    # get the father of a leaf
    def mid(self,index):
        if index * 2 + 1 > self.size:
            return index * 2
        else:
            if self.heapList[index*2] < self.heapList[index*2+1]:
                return index * 2
            else:
                return index * 2 + 1

    #delete the minimun value
    def delete(self):
        #value to delete
        val = self.heapList[1]
        # equal to the last
        self.heapList[1] = self.heapList[self.size]
        # reduce the size
        self.size = self.size - 1
        #remove the element
        self.heapList.pop()
        #organize the heap
        self.putDown(1)

    # organize the entire heap from a list
    def buildHeap(self,alist):
        #initial position
        i = len(alist) // 2
        #put the size
        self.size = len(alist)
        #put the list
        self.heapList = [0] + alist[:]
        #oraganize
        while (i > 0):
            self.putDown(i)
            i = i - 1

    def printheap(self):
        a = self.heapList[1:len(self.heapList)]
        return a
