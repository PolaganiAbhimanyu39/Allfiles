import pygame
class Ship:
    """A class to manage the ship."""
    def __init__(self, ai_game):
        """Initialize the ship and set it's starting position."""
        self.screen = ai_game.screen
        self.settings = ai_game.settings
        self.screen_rect = ai_game.screen.get_rect()
        #Load the ship image and get it's rect.
        self.image = pygame.image.load("C:/Users/Polagani Ramesh/OneDrive/Pictures/game_rocket.bmp")
        self.rect = self.image.get_rect()

        #Start each new screen at the bottom center of the screen.
        self.rect.midbottom = self.screen_rect.midbottom
        # Store a float for the ship's exact horizontal position.
        self.x = float(self.rect.x)

        # Movement flag; start with a ship that's not moving.
        self.moving_right = False
        self.moving_left = False
    def update(self):
        """Update the ship's position based on the movement flag."""
        if self.moving_right and self.rect.right < self.screen_rect.right:
            self.x += self.settings.ship_speed
        elif self.moving_left and self.rect.left > 0:
            self.x -= self.settings.ship_speed
        self.rect.x = self.x
    def blitme(self):
        self.screen.blit(self.image, self.rect)
    def center_ship(self):
        """Centre the ship on the screen"""
        self.rect.midbottom = self.screen_rect.midbottom
        self.x = float(self.rect.x)
        print(self.x)


