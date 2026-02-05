import sys


def f1(val):
    if str(val) == str(val)[::-1]:
        print ("¡%s es correcto!") % (val)
        return val
    else:
        print ("¡Mal, no nos vale!")
        sys.exit()

def f2(suma):
    if ( f3(suma)) and (suma % 7 == 1) :
        print ("¡%s es correcto!") % (suma)
        return suma
    else:
        print ("¡Mal, no nos vale!")
        sys.exit()

def f3(num):
    bool = True
    for i in range (2, num):
        if(num%i==0):
            bool = False
    return (bool and (num>1))

def f4(val):
    nums = val.split(" ")
    for n in nums:
            if int(n)<10 or (f3(int(n)) == False):
                print("¡¡No vale!!")
                sys.exit()
    x_ = 0
    for n in nums:
        x_ += int(n)
    if f3(x_) == False:
        print ("¡i¡No nos vale!!!")
        sys.exit()
    return x_
def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    print_hi(f3(71))

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
