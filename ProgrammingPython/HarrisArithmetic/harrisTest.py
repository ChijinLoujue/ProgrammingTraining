from PIL import Image

from numpy import *
import harris
from pylab import *
from scipy.ndimage import filters

im = array(Image.open('33.jpg').convert('L'))
harrisim = harris.compute_harris_response(im)
filtered_coords = harris.get_harris_points(harrisim)
harris.plot_harris_points(im, filtered_coords)