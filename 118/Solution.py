class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
                    
        x = []
        x.append([1])
        x.append([1,1])
        
        if numRows == 1:
            return x[:1]
        elif numRows == 2:
            return x
        else:

            for i in range(2,numRows):
                y = []
                temp = x[-1]
                for j in range(1, len(temp)):
                    y.append(sum((temp[j],temp[j-1])))
                y.insert(0, 1)
                y.append(1)
                x.append(y)
            return x

	# def generate(self, numRows: int) -> List[List[int]]:
    #     x = list()
    #     for i in range(0,numRows):
    #         y = list()
    #         for j in range(0, i+1):
    #             if j == 0 or i == j:
    #                 y.append(1)
    #             else:
    #                 y.append(x[i-1][j-1] + x[i-1][j])
    #         x.append(y)
    #     return x