from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
# When index fun. is called return http response for text Hello, World!
def index(request):
    return HttpResponse("Hello")
def harry(request):
    return HttpResponse("Hello, Harry!")
def ron(request):
    return HttpResponse("Hello, Ron!")
# render fun. takes request and path to what to show to the user here path is inside templates folder there's another folder htmlfiles inside which there's show.html run this file
def show(request):
    return render(request, "htmlfiles/show.html") 
# in this render fun. takes an additional argument in the form as a dictionary the keys in this dictionary are provided to specified file
def greet(request, name):
    return render(request,"htmlfiles/greet.html",{
        "name":name.capitalize(),
    })