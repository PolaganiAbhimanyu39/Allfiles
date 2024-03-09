from django.shortcuts import render
tasks=["foo","bar","baz"]
# Create your views here.
def index(request):
    return render(request,"tasks/view.html",{
        "val":tasks,
    })
def view(request):
    return render(request,"tasks/demo.html")