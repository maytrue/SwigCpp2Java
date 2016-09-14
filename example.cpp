#include "example.h"

const double PI = 3.1415;

int Shape::nshapes = 0;

void Shape::move(double dx, double dy)
{
}

double Circle::area()
{
	return PI * radius * radius;
}

double Circle::perimeter()
{
	return radius * 2 * PI;
}

double Square::perimeter()
{
	return 4 * (width);
}

double Square::area()
{
	return width * width;
}